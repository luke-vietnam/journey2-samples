package ninja.luke.mobi.journey2.advanced.input3steps.screen.input2

import ninja.luke.mobi.journey2.advanced.input3steps.I3Sdk
import ninja.luke.mobi.journey2.advanced.input3steps.I3ViewModel
import ninja.luke.mobi.journey2.advanced.input3steps.R
import ninja.luke.mobi.journey2.advanced.input3steps.databinding.Input3stepsScreenInput2Binding
import ninja.luke.mobi.journey2.scope.screen.J2ScreenFragmentBinding
import ninja.luke.mobi.journey2.scope.screen.injectJourneyViewModel

class Input2Screen : J2ScreenFragmentBinding<Input3stepsScreenInput2Binding, Input2Route>(
    I3Sdk, R.layout.input3steps_screen_input2
) {

    private val vm: I3ViewModel by injectJourneyViewModel()

    override fun afterOnViewCreated() {
        super.afterOnViewCreated()
        viewBinding.lifecycleOwner = viewLifecycleOwner
        viewBinding.vm = vm
        viewBinding.next.setOnClickListener {
            route?.onInput2Finish(vm.input2.value ?: "")
        }
    }
}